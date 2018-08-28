function login() {
    // language=JQuery-CSS
    var name = $("input[name='name']").val().trim();
    // language=JQuery-CSS
    var password = $("input[name='password']").val().trim();
    $.ajax({
        url: '/login',
        type: 'POST',
        dataType: 'JSON',
        data: {
            "name": name,
            "password": password
        },
        success: function (data) {
            if (data) {
                alert("登录成功");
                window.location.href = "nice";
            } else {
                alert("登录失败");
                alert("不要放弃这个密码不难的,多试试");
            }
        }
    });
}