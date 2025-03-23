package `Gerenciador de Tarefas`

class gerenciadorTarefas {
    private var tarefas = arrayOf<String>(); //declara um array vazio para armazenar as tarefas do usuario


    fun adicionarTarefa(tarefa: String){
        tarefas = tarefas.plus(tarefa) // adiciona a nova tarefa ultilizando o metodo plus
    }

    fun removerTarefa(tarefa: String){
        tarefas = tarefas.filter{ it != tarefa}.toTypedArray() // Remove tarefa especificada ultilizando filter e converte o resultado para um array de string
    }
    fun exibirTarefas(){
        if (tarefas.isEmpty()){
            println("Array, vazio")
        }else {
            println("Tarefas:")
            for(tarefa in tarefas){
                println("- $tarefa")
            }
        }
    }
}

fun main(){
    val gerenciador = gerenciadorTarefas() // cria uma instancia de classe gerenciadorTarefas

    gerenciador.adicionarTarefa("Estudar kotlin") // adiciona tarefa ao gerenciador
    gerenciador.adicionarTarefa("Comer")
    gerenciador.adicionarTarefa("Assistir video aula")

    gerenciador.exibirTarefas() // exibe as tarefas

    gerenciador.removerTarefa("Comer") //remove tarefa especifica

    gerenciador.exibirTarefas()
}
