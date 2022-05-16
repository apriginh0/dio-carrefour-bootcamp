function getAdmins(map) {
    let admins = [];
    for([key, value] of map) {
        if(value === 'Admin') {
            admins.push(key);
        }
    }
    return admins;
}

const usuarios = new Map();

usuarios.set('Diego', 'Admin');
usuarios.set('Sophia', 'User');
usuarios.set('Savita', 'Admin');
usuarios.set('Icaro', 'User');

console.log(getAdmins(usuarios));