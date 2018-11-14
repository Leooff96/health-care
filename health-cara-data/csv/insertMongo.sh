#!/bin/bash

DB="smarthealth"

echo "=========================================================="
echo "Inserção dos Dados no Mongo Local"
echo "=========================================================="
echo ""
echo "=========================================================="
echo "CONFIGURACAO"
echo "Name DataBase: $DB"
echo "Host: 127.0.0.1"
echo "Port: 27017"
echo "=========================================================="
echo ""

max=`bash -c 'ls | grep -v *.sh | wc -l'`


echo ""
echo "------------------Limpando DateBase $DB-------------------"
echo ""
mongo $DB --eval "db.dropDatabase();"
echo ""
echo "----------------------------------------------------------"
echo ""
echo ""

echo "------------------Insert dos CSV(s)-----------------------"
echo ""
for i in `ls | grep -v *.sh`
do
    echo "CSV: $i"
    mongoimport -d $DB -c ${i:0:-5} --type csv --file "$i" --headerline
    echo ""
done
echo ""
echo "----------------------------------------------------------"


