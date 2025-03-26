var inputtarea = document.getElementById("tarea");
var btn = document.getElementById("Agregar");
var listado = document.getElementById("listado");

btn.onclick = function () {
    if (inputtarea.value == "") {
        return;
    }
    var elemento = inputtarea.value;
    var li = document.createElement("li");
    li.textContent = elemento;
    listado.appendChild(li);
    li.dataset.originalIndex = listado.children.length;
    li.onclick = function () {
        if (li.classList.contains("tachado")) {
            li.classList.remove("tachado");

            let index = parseInt(li.dataset.originalIndex);
            listado.insertBefore(li, listado.children[index]);
        } else {
            li.classList.add("tachado");
            listado.appendChild(li);
        }
    };
    var btnEliminar = document.createElement("span");
    btnEliminar.textContent = "\u00d7";
    li.appendChild(btnEliminar);
    btnEliminar.onclick = function (event) {
        event.stopPropagation();
        li.remove();
    };
    listado.appendChild(li);
    inputtarea.value = "";
};

