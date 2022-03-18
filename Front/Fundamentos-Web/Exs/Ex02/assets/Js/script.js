

//puxamos o id do input com o id nome 
let nome = window.document.querySelector('#nome')
let email = window.document.querySelector('#email')
let assunto = window.document.querySelector('#assunto')

let okNome = false
let okEmail = false
let okAssunto = false

//podemos tambem fazer isso com  var nome = window.document.querySelector('#nome') caso for uma classe ('.nome')

function validarNome(){
    let txtNome = document.querySelector('#txtNome')
    if(nome.value.length < 3){
        //alert('Olá, Mundo!')
        txtNome.innerHTML = 'nome invalido'
        txtNome.style.color = 'red'
        okNome = false
}

    else{
        txtNome.innerHTML = 'deu bom'
        txtNome.style.color = 'green'
        okNome = true
    }

}

    function enviar(){
        if(okNome == true && okEmail == true && okAssunto == true){
            alert('Mensagem enviada com sucesso');
        }

        else{
            alert('Preencha corretamente');
        }
}


    function validarEmail(){
        let txtEmail = document.querySelector('#txtEmail')

        if(email.value.indexOf('@') == -1 || email.value.indexOf('.') == -1) {
            txtEmail.innerHTML = 'Email invalido'
            txtEmail.style.color = 'red'
            okEmail = false
        }

        else{
            txtEmail.innerHTML = 'Email Valido'
            txtEmail.style.color = 'green'
            okEmail = true
        }

}

    function validarAssunto(){
        let txtAssunto = document.querySelector('#txtAssunto')

        if(assunto.value.length >= 100){
            txtAssunto.innerHTML = 'Texto muito grande, digite no maximo 100 caracteres'
            txtAssunto.style.color = 'red'
            txtAssunto.style.display = 'block'
            okAssunto = false
        }

        else{
            txtAssunto.style.display = 'none'
            okAssunto = true
        }
    }



