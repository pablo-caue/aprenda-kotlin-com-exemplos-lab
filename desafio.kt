// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }

data class Usuario(val nome: String)

data class ConteudoEducacional(var nome: String, val duracao: Int = 60)

data class Formacao(val nome: String,val nivel: Nivel, var conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()
    
    fun matricular(usuario: Usuario) {
        inscritos.add(usuario)
        println("${usuario.nome} matriculado")
    }
    fun getMatricular(){
        println("Alunos matriculados:")
        for (i in inscritos){
            println(i.nome)
        }
    }
}

fun main() {
    val listConteudo = listOf(
        ConteudoEducacional("kotlin", 50),
        ConteudoEducacional("javascript"),
        ConteudoEducacional("java", 90))

    val formacao = Formacao("Desenvolvedor", Nivel.DIFICIL, listConteudo)

    formacao.matricular(Usuario("Marcos"))
    formacao.matricular(Usuario("Eduardo"))
    formacao.matricular(Usuario("Joao"))
    formacao.matricular(Usuario("Pablo"))
    formacao.matricular(Usuario("Davi"))
    formacao.matricular(Usuario("André"))

    formacao.getMatricular()
}
