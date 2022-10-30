/* global fetch */

document.addEventListener("DOMContentLoaded", () => {
    const doctores = document.querySelector("#doctores");
    const doctoresForm = document.querySelector("#create-doctor");
    console.log(doctoresForm);
    doctoresForm.addEventListener('submit', createDoctor);


    fetch("http://localhost:8080/pacientes/list")
            .then(response => response.json())

            .then(doctor => doctor.forEach(slapItOnTheDOM));
    function slapItOnTheDOM(doctor) {
        const doctorLi = document.createElement("Li");
        doctorLi.dataset.idDoctor = doctor.idDoctor;
        doctorLi.innerHTML = '<span>' + doctor.nombreDoctor + '-'
                + doctor.apllidoDoctor1 + '-'
                + doctor.apllidoDoctor2 + '-'
                + doctor.edadDoctor + '-'
                + doctor.correo + '-'
                + doctor.idEspecializacion + '-'
                + doctor.telefono + '-' + '</span>';
        doctores.appendChild(doctorLi);


    }
    function createDoctor(event) {
        console.log("crear Doctor");
        event.preventDefault();
        let nuevoDoctores = reunirFormData();
        return fetch("http://localhost:8080/doctor/", {
            method: "POST",
            headers: {
                'Content-Type': 'application/json',
                'Accept': 'application/json'
            },
            body: JSON.stringify(nuevoDoctores)
        })
                .then(res => res.json())
                .then(doctor => (slapItOnTheDOM(doctor)));
    }
    function reunirFormData() {
        return{
            idDoctor: event.target.idDoctor.value,
            nombreDoctor: event.target.nombreDoctor.value,
            apellidoDoctor1: event.target.apellidoDoctor1.value,
            apellidoDoctor2: event.target.apellidoDoctor2.value,
            edadDoctor: event.target.edadDoctor.value,
            correo: event.target.correo.value,
            idEspecializacion: event.target.idEspecializacion.value,
            telefono: event.target.telefono.va

        };
    }
});


