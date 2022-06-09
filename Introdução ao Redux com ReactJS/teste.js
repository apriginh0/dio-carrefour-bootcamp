var input = require("fs").readFileSync("stdin", "utf8");
var totalItems = input.split(" ").map(item => parseInt(item));

console.log(totalItems);
let pares = [];
let impares = [];

for (let i = 0; i < totalItems.length; i++) {
  let number = totalItems[i];
  if ( number%2 == 0  ){
    pares.push(number);
  }
  else {
    impares.push(number);
  }
}

pares.sort((a, b) => a - b);
impares.sort((a, b) => b - a );
for(let i = 0; i < pares.length;i++){
  console.log(pares[i]);
}
for(let i = 0; i < impares.length;i++){
  console.log(impares[i]);
}

