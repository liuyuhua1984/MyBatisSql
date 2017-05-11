@echo off
set hh=%time:~0,1%

if "%hh%" == " " (
	set hh=0%time:~1,1%
	
)else (
	set hh=%time:~0,2%
	
)


mysqldump -P3306 -uroot -p987654321   --default-character-set=utf8 --add-locks=false --complete-insert edu_simple_pay > E:\backupsql\edu_simple_pay_%data~,4%%date:~5,2%%date:~8,2%-%hh%-%time:~3,2%-%time:~6,2%.sql
@echo on
pause