function toggleCompanyForm() {
    var companyForm = document.getElementById('companyForm');
    var personalForm = document.getElementById('personalForm');
    companyForm.style.display = (companyForm.style.display === 'none' ? 'block' : 'none');
    personalForm.style.display = 'none';
}

function togglePersonalForm() {
    var personalForm = document.getElementById('personalForm');
    var companyForm = document.getElementById('companyForm');
    personalForm.style.display = (personalForm.style.display === 'none' ? 'block' : 'none');
    companyForm.style.display = 'none';
}
document.addEventListener('DOMContentLoaded', function() {
    var toggleNoteButton = document.querySelector('.toggleNoteForm');
    var noteForm = document.querySelector('.noteForm');
    
    toggleNoteButton.addEventListener('click', function(event) {
        event.preventDefault(); // Formun gönderilmesini engelleyerek sayfa yenilenmesini durdur
        noteForm.style.display = noteForm.style.display === 'block' ? 'none' : 'block';
    });
});

