function validaArray(arr, num){
    try{
        if(!arr && !num) throw new ReferenceError("Envie os parâmetros");

        if(typeof arr !== 'object') throw new TypeError("Array precisa ser do tipo object");

        if(typeof num !== 'number') throw new TypeError("Num precisa ser do tipo number");
    
        if(arr.length !== num) throw new RangeError("Tamanho inválido!");

        return arr;
    }
    catch(e){
        if(e instanceof ReferenceError){
            console.log("Este erro é um ReferenceError")
            console.log(e.name)
            console.log(e.stack)
            console.log(menssage)
        } else if(e instanceof TypeError){
            console.log("Este erro é um TypeError")
            console.log(e.name)
            console.log(e.stack)
            console.log(menssage)
        } else if(e instanceof RangeError){
            console.log("Este erro é um RangeError")
            console.log(e.name)
            console.log(e.stack)
            console.log(menssage)
        } else {
            console.log("Ocorreu um tipo de erro não esperado: " + e)
        }
    }
}