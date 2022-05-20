var saldo = 500;
function listP(preco){
    return Object.values(preco);
}
function saldoFinal(arr){
    saldo = arr.reduce(function(acc, cur, idx){
        console.log('rodada ', idx + 1);
        console.log({acc});
        console.log({cur});
        return acc - cur;
    }, saldo);
    return saldo;
}
const feira = { leite: 6.60, ovo: 3.45, microondas: 300, }

console.log(saldoFinal(listP(feira)));
console.log(saldo);

// VERSAO QUE TENTEI CRIAR SOZINHO