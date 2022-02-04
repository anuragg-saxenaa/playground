# playground

Install JDK on Mac abd set Java hoome

/$ /usr/libexec/java_home -v<version number>
/Library/Java/JavaVirtualMachines/jdk-14.jdk/Contents/Home

$ vim .bash_profile
export JAVA_HOME=$(/usr/libexec/java_home)

$ echo $JAVA_HOME
/Library/Java/JavaVirtualMachines/jdk-14.jdk/Contents/Home
