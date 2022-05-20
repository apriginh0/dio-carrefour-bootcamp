const feira = [
    {
        name: 'leite',
        preco: 6.60,
    },
    {
        name: 'ovo',
        preco: 3.45,
    },
    {
        name: 'microondas',
        preco: 300,
    },
];
const saldo = 500; 

function calculaSaldo(saldoDisponivel, lista){
    return lista.reduce(function(prev, current, index){
        console.log('rodada ', index + 1);
        console.log({prev});
        console.log({current});
        return prev - current.preco;
    }, saldoDisponivel);
}

console.log(calculaSaldo(saldo, feira));
console.log(saldo);