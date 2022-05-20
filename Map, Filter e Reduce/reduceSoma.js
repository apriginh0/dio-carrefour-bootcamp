function somaNumeros(arr) {
    return arr.reduce(function(prev, current){
        console.log({ prev });
        console.log({ current });
        return prev + current;
    }, 0) // este 0 faz com que o prev inicie com o valor = 0
}

const arr = [1, 2, 3, 4, 5];
console.log(somaNumeros(arr));