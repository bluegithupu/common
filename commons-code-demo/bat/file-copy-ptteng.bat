@echo off
setlocal enabledelayedexpansion
rem for  %%m in (Potentail User UserOpenRelation Paper UserPaperRelation) do ( 

for  %%m in ( UserOpenRelation) do ( 
set model=%%m
set modelFile=!model!.java
echo modelFile is !modelFile!

set serviceFile=!model!Service.java
set clientFile=!model!SCAClient.java
set implFile=!model!ServiceImpl.java
set daoConfigFile=!model!_dao.xml
set testFile=!model!Test.java

set sourcePath=D:\eclipse-workspace\gemantic-3.7-workspace\common\commons-code-demo
set coreProjectPath=D:\eclipse-workspace\gemantic-3.7-workspace\paper
set serviceProjectPath=D:\eclipse-workspace\gemantic-3.7-workspace\paper

set modelPath=src\main\java\com\qding\framework\user\model
set servicePath=src\main\java\com\qding\framework\user\service
set clientPath=src\main\java\com\qding\sca\framework\user\client
set implPath=src\main\java\com\qding\framework\user\service\impl
set daoConfigPath=src\main\resources
set testPath=src\test\java\com\qding\framework\user\service\impl

echo "model" !sourcePath!\!modelPath!\!modelFile! !coreProjectPath!\!modelPath!
copy !sourcePath!\!modelPath!\!modelFile! !coreProjectPath!\!modelPath! /y
echo "service"
copy !sourcePath!\!servicePath!\!serviceFile! !coreProjectPath!\!servicePath! /y
echo "client"
copy !sourcePath!\!clientPath!\!clientFile! !coreProjectPath!\!clientPath! /y
echo "impl"
copy !sourcePath!\!implPath!\!implFile! !serviceProjectPath!\!implPath! /y
echo "daoConfig"
copy !sourcePath!\!daoConfigPath!\!daoConfigFile! !serviceProjectPath!\!daoConfigPath! /y
echo "test" !sourcePath!\!testPath!\!testFile! !serviceProjectPath!\!testPath!
copy !sourcePath!\!testPath!\!testFile! !serviceProjectPath!\!testPath! /y



) 

echo "all copy over check it"
pause