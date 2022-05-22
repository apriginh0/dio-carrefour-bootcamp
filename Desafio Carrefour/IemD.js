let totalDeDias = parseInt(gets());

let qtdAnos, qtdMeses;

if(totalDeDias >= 365){
qtdAnos = parseInt(totalDeDias/365);
totalDeDias= totalDeDias % (qtdAnos*365);
} else qtdAnos = 0

if(totalDeDias >= 30){
qtdMeses= parseInt(totalDeDias/30);
totalDeDias= totalDeDias % (qtdMeses*30);
} else qtdMeses = 0

let resultado = (qtdAnos + " ano(s) " + '\n' + 
qtdMeses +" mes(es)" + '\n' +
totalDeDias + " dia(s)");

print(resultado);