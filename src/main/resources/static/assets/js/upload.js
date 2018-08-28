function fileUpload() {

    var formData = new FormData();
    formData.append('file', $('#file')[0].files[0]);
    $.ajax({
        url: 'http://localhost:5000/fileUpload',
        type: 'POST',
        cache: false,
        data: formData,
        processData: false,
        contentType: false
    }).done(function (res) {
    }).fail(function (res) {
    });
}
