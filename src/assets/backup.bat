SET PG_USER=posuser
SET PG_DATABASE=posdb
SET PGPASSWORD=pos12345
SET FILE_STORAGE_PATH="C:\Users\Alee\Desktop"
SET DUMP_FILENAME=%FILE_STORAGE_PATH%\%PG_DATABASE%.sql
"C:/I2p/pgsql/bin/pg_dump.exe" -h "localhost" -U %PG_USER% -f %DUMP_FILENAME% %PG_DATABASE%