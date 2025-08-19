@ECHO OFF
SETLOCAL
SET WRAPPER_JAR=.mvn\wrapper\maven-wrapper.jar
SET WRAPPER_URL=https://repo.maven.apache.org/maven2/org/apache/maven/wrapper/maven-wrapper/3.2.0/maven-wrapper-3.2.0.jar

IF NOT EXIST .mvn\wrapper (
  mkdir .mvn\wrapper 1>NUL 2>NUL
)

IF NOT EXIST "%WRAPPER_JAR%" (
  ECHO Downloading Maven Wrapper...
  powershell -NoProfile -ExecutionPolicy Bypass -Command "try { $ProgressPreference='SilentlyContinue'; Invoke-WebRequest -UseBasicParsing -Uri '%WRAPPER_URL%' -OutFile '%WRAPPER_JAR%' } catch { exit 1 }"
  IF NOT EXIST "%WRAPPER_JAR%" (
    ECHO Failed to download Maven Wrapper jar
    EXIT /B 1
  )
)

SET JAVA_EXE=java
"%JAVA_EXE%" -classpath "%WRAPPER_JAR%" -Dmaven.multiModuleProjectDirectory=. org.apache.maven.wrapper.MavenWrapperMain %*
EXIT /B %ERRORLEVEL%


