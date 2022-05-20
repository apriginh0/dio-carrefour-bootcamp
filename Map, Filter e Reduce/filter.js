const frutas = ['maçã fuji', 'maçã verde', 'laranja', 'abacaxi'];
frutas.filter((fruta) => fruta.includes('maçã'))
function filterPares(arr) {
    return arr.filter(calback);
}
function calback(item) {
    return item % 2 !== 0;
}

const arrTest = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20];

console.log(filterPares(arrTest));