const start = document.getElementById("startDate").value;
const end = document.getElementById("endDate").value;

document.getElementById("outStart").innerText = start || "____ / ____ / ______";
document.getElementById("outEnd").innerText = end || "____ / ____ / ______";

function fillContract() {

    const name = document.getElementById("empName").value;
    const position = document.getElementById("empPosition").value;
    const salary = document.getElementById("empSalary").value;
    const dateA = document.getElementById("empDateA").value;
    const dateB = document.getElementById("empDateB").value;
    
    const start = document.getElementById("startDate").value;
    const end = document.getElementById("endDate").value;

    document.getElementById("outName").innerText = name || "________________________________________";
    document.getElementById("outSigName").innerText = name || "______________________________";
    document.getElementById("outPosition").innerText = position || "____________________________________________";
    document.getElementById("outSalary").innerText = salary || "___________";

    document.getElementById("outDateA").innerText = dateA || "____ / ____ / ______";
    document.getElementById("outDateB").innerText = dateB || "____ / ____ / ______";

    document.getElementById("outStart").innerText = start || "____ / ____ / ______";
    document.getElementById("outEnd").innerText = end || "____ / ____ / ______";
}

