let line = gets().split(" ");
const a = parseInt(line[0]);
const b = parseInt(line[1]);

q = parseInt(a / b);

r = a - b * q;

if (r < 0) {
  r -= Math.abs(b);
  
  q = (a - r) / b;    //escreva sua lógica aqui
}
if (a < 0 && b < 0) {
    
    q = Math.ceil(a / b);
    
    r = a - b * q;
}

print(q + " " + r);