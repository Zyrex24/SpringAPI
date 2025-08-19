#!/bin/sh

# ----------------------------------------------------------------------------
# Maven Wrapper Startup Script for POSIX Shell
# ----------------------------------------------------------------------------

MAVEN_CMD="mvn"
WRAPPER_JAR=".mvn/wrapper/maven-wrapper.jar"
WRAPPER_URL="https://repo.maven.apache.org/maven2/org/apache/maven/wrapper/maven-wrapper/3.2.0/maven-wrapper-3.2.0.jar"

if [ ! -f "$WRAPPER_JAR" ]; then
  mkdir -p .mvn/wrapper
  echo "Downloading Maven Wrapper..."
  if command -v curl >/dev/null 2>&1; then
    curl -fsSL "$WRAPPER_URL" -o "$WRAPPER_JAR" || exit 1
  elif command -v wget >/dev/null 2>&1; then
    wget -q "$WRAPPER_URL" -O "$WRAPPER_JAR" || exit 1
  else
    echo "Error: curl or wget required to download Maven Wrapper" >&2
    exit 1
  fi
fi

JAVA_EXE="java"
exec "$JAVA_EXE" -classpath "$WRAPPER_JAR" -Dmaven.multiModuleProjectDirectory=. org.apache.maven.wrapper.MavenWrapperMain "$@"


