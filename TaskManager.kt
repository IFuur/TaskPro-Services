class TaskManager {
    private val tasks: MutableList<Task> = mutableListOf()

    fun addTask(task: Task) {
        tasks.add(task)
    }

    fun getTasks(): List<Task> {
        return tasks
    }

    fun updateTask(taskId: Int, isCompleted: Boolean) {
        tasks.find { it.id == taskId }?.let { task ->
            task.isCompleted = isCompleted
        }
    }

    fun deleteTask(taskId: Int) {
        tasks.removeIf { it.id == taskId }
    }
}