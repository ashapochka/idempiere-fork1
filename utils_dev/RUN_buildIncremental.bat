@Title Build Adempiere Incremental + Install
@Rem $Header: /cvsroot/adempiere/utils_dev/RUN_buildIncremental.bat,v 1.14 2005/09/08 21:56:11 jjanke Exp $

@Rem Check java home
@IF NOT EXIST "%JAVA_HOME%\bin" ECHO "** JAVA_HOME NOT found"
@SET PATH=%JAVA_HOME%\bin;%PATH%

@Rem Check jdk
@IF NOT EXIST "%JAVA_HOME%\lib\tools.jar" ECHO "** Need Full Java SDK **"

@Echo	Stop Apps Server (waiting)
@START %ADEMPIERE_HOME%\utils\RUN_Server2Stop.bat
@Rem Wait 5 second
@PING 1.1.1.1 -n 1 -w 5000 > NUL

@Rem Set ant classpath
@SET ANT_CLASSPATH=%CLASSPATH%;..\tools\lib\ant.jar;..\tools\lib\ant-launcher.jar;..\tools\lib\ant-swing.jar;..\tools\lib\ant-commons-net.jar;..\tools\lib\commons-net-1.4.0.jar
@SET ANT_CLASSPATH=%ANT_CLASSPATH%;"%JAVA_HOME%\lib\tools.jar"

@echo Building ...
@"%JAVA_HOME%\bin\java" -classpath %ANT_CLASSPATH% -Dant.home="." %ANT_PROPERTIES% org.apache.tools.ant.Main update
@Echo ErrorLevel = %ERRORLEVEL%

@IF NOT ERRORLEVEL 0 GOTO BUILDOK
@Pause
@Exit

:BUILDOK

@Rem Echo	Cleaning up ...
@Rem erase /q /s %TMP%

@Echo	Starting Apps Server ...
@Start %ADEMPIERE_HOME%\utils\RUN_Server2.bat

@Pause
@Exit
