

//puxamos o id do input com o id nome 
var nome = window.document.querySelector('#nome')

var okNome = false

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
        if(okNome == true){
            alert('Mensagem enviada com sucesso');
        }

        else{
            alert('Preencha corretamente');
        }
    }
