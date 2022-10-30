/* global fetch */

document.addEventListener("DOMContentLoaded", () => {
    const citasMedicas = document.querySelector("#citasMedicas");
    const citasMedicasForm = document.querySelector("#create-citas");
    console.log(citasMedicasForm);
    citasMedicasForm.addEventListener('submit',createCitasMedicas);


    fetch("http://localhost:8080/citasmedicas/list")
            .then(response => response.json())

            .then(citamedica => citamedica.forEach(slapItOnTheDOM));
    function slapItOnTheDOM(citamedica) {
        const citamedicaLi = document.createElement("Li");
        citamedicaLi.dataset.idCitasMedicas = citamedica.idCitasMedicas;
        citamedicaLi.innerHTML = '<span>' + citamedica.fecha + '-'
                + citamedica.hora + '-'
                + citamedica.idPaciente + '-'
                + citamedica.idDoctor + '-'
                + citamedica.idCopago + '-'+'</span>';
                
        citasMedicas.appendChild(citamedicaLi);


    }
    function createCitasMedicas(event) {
        console.log("Asignar Cita medica");
        event.preventDefault();
        let nuevaCita = reunirFormData();
        return fetch("http://localhost:8080/citasmedicas/", {
            method: "POST",
            headers: {
                'Content-Type': 'application/json',
                'Accept': 'application/json'
            },
            body: JSON.stringify(nuevaCita)
        })
                .then(res => res.json())
                .then(citamedica =>(slapItOnTheDOM(citamedica)));
    }
    function reunirFormData() {
        return{
            idCitaMedicas: event.target.idPaciente.value,
            fecha: event.target.fecha.value,
            hora: event.target.hora.value,
            idPaciente: event.target.idPaciente.value,
            idDoctor: event.target.idDoctor.value,
            idCopago: event.target.idCopago.value
            


        };
    }
});

