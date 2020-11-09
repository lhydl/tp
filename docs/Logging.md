# Logging Guide

## Table of Contents
1. [Setting up and usage of logging](#1)


#### 1. Setting up and usage of logging <a name="1"></a>

* We are using `java.util.logging` package for logging.
*  The `Logger` for a class can be obtained using `Logger.getLogger(Class)`
 which will log messages according to the specified logging level.
*  Log messages are output through the console and to a `.log` file.
*  The output logging level can be controlled using the `logLevel` setting.
* **When choosing a level for a log message**, follow the conventions 
given in [_[se-edu/guides] Java: Logging conventions_](https://se-education.org/guides/conventions/java/logging.html).

[Home Page](https://ay2021s1-cs2113t-f12-4.github.io/tp/)