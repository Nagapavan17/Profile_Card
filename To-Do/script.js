function addTask() {
    let taskInput = document.getElementById("taskInput");
    let taskText = taskInput.value.trim();

    if (taskText === "") {
        alert("Please enter a task!");
        return;
    }

    let taskList = document.getElementById("taskList");

    // Create a new list item
    let li = document.createElement("li");
    li.textContent = taskText;

    // Create delete button
    let deleteBtn = document.createElement("button");
    deleteBtn.textContent = "Delete";
    deleteBtn.className = "delete-btn";
    deleteBtn.onclick = function () {
        taskList.removeChild(li);
    };

    // Append button to the list item
    li.appendChild(deleteBtn);

    // Append list item to the task list
    taskList.appendChild(li);

    // Clear input field
    taskInput.value = "";
}
