/* global fetch */

document.addEventListener("DOMContentLoaded", () => {
    const pacientes = document.querySelector("#pacientes");
    const pacientesForm = document.querySelector("#create-pacientes");
    console.log(pacientesForm);
    pacientesForm.addEventListener('submit',createPacientes);


    fetch("http://localhost:8080/pacientes/list")
            .then(response => response.json())

            .then(paciente => paciente.forEach(slapItOnTheDOM));
    function slapItOnTheDOM(paciente) {
        const pacienteLi = document.createElement("Li");
        pacienteLi.dataset.idPaciente = paciente.idPaciente;
        pacienteLi.innerHTML = '<span>' + paciente.nombrePaciente + '-'
                + paciente.apllidoPaciente1 + '-'
                + paciente.apllidoPaciente2 + '-'
                + paciente.edad + '-'
                + paciente.genero + '-'
                + paciente.telefono + '-'
                + paciente.direccion + '-'
                + paciente.correo + '-'
                + paciente.eps + '</span>';
        pacientes.appendChild(pacienteLi);


    }
    function createPacientes(event) {
        console.log("crear Paciente");
        event.preventDefault();
        let nuevoPacientes = reunirFormData();
        return fetch("http://localhost:8080/pacientes/", {
            method: "POST",
            headers: {
                'Content-Type': 'application/json',
                'Accept': 'application/json'
            },
            body: JSON.stringify(nuevoPacientes)
        })
                .then(res => res.json())
                .then(paciente =>(slapItOnTheDOM(paciente)));
    }
    function reunirFormData() {
        return{
            idPaciente: event.target.idPaciente.value,
            nombrePaciente: event.target.nombrePaciente.value,
            apellidoPaciente1: event.target.apellidoPaciente1.value,
            apellidoPaciente2: event.target.apellidoPaciente2.value,
            edad: event.target.edad.value,
            genero: event.target.genero.value,
            telefono: event.target.telefono.value,
            direccion: event.target.direccion.value,
            correo: event.target.correo.value,
            eps: event.target.eps.value


        };
    }
});


