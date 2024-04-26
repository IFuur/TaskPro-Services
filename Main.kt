fun main() {
    val taskManager = TaskManager()

    // Adicionando tarefas
    taskManager.addTask(Task(1, "Task 1", "This is task 1", "2024-04-25", false))
    taskManager.addTask(Task(2, "Task 2", "This is task 2", "2024-04-26", false))
    taskManager.addTask(Task(3, "Task 3", "This is task 3", "2024-04-27", false))

    // Imprimindo todas as tarefas
    println("All tasks:")
    taskManager.getTasks().forEach { println(it) }

    // Atualizando uma tarefa
    taskManager.updateTask(1, true)

    // Imprimindo todas as tarefas após a atualização
    println("All tasks after update:")
    taskManager.getTasks().forEach { println(it) }

    // Deletando uma tarefa
    taskManager.deleteTask(2)

    // Imprimindo todas as tarefas após a exclusão
    println("All tasks after delete:")
    taskManager.getTasks().forEach { println(it) }
}