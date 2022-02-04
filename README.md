# playground

# How to install Java JDK Java Development Kit on mac.
In Mac OS or later, Apple recommends to set the $JAVA_HOME variable to /usr/libexec/java_home, 
just export $JAVA_HOME in file ~/. bash_profile or ~/.profile.

Find out where is JDK <version number>.




/$ /usr/libexec/java_home -v<version number>
  
/Library/Java/JavaVirtualMachines/jdk-14.jdk/Contents/Home

$ vim .bash_profile
export JAVA_HOME=$(/usr/libexec/java_home)

$ echo $JAVA_HOME
/Library/Java/JavaVirtualMachines/jdk-14.jdk/Contents/Home
