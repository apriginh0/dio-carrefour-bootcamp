const meuArrey = [30, 30, 40, 5, 223, 2049, 3034, 5];

function valoresUnicos(arr){
    const mySet = new Set(arr);

    return [...mySet];
}

console.log(valoresUnicos(meuArrey));

// Sem os 3 pontos antes de mySet, o resultado será um SET dentro do arrey
// [ Set(6) {30, 40, 5, 223, 2049, 3034 } ]
// Enquanto com os 3 pontos (tecnica espred, algo assim, argumento rech), tornam os elementos do Set em elementos do Arrey
// [ 30, 40, 5, 223, 2049, 3034 ]