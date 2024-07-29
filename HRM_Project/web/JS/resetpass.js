document.addEventListener("DOMContentLoaded", function () {

    const modal = document.getElementById('errorModal');
    const confirmButton = document.getElementById('confirmReset');
    const showPasswordNew = document.getElementById('showPasswordNew');
    const showPasswordConfirm = document.getElementById('showPasswordConfirm');
    const newPasswordField = document.getElementById('newPassword');
    const confirmPasswordField = document.getElementById('confirmPassword');

    // Hiển thị modal khi trang đã tải xong
    if (modal) {
        modal.style.display = 'block';
        setTimeout(function () {
            modal.style.display = 'none'; // Tự động ẩn modal sau 5 giây
        }, 5000);
    }

    // Xác nhận khi nhấn nút "Confirm"
    if (confirmButton) {
        confirmButton.addEventListener('click', function (event) {
            const confirmation = confirm("Are you sure you want to reset the password?");
            if (!confirmation) {
                event.preventDefault();
            }
        });
    }

    // Hiển thị mật khẩu mới
    if (showPasswordNew) {
        showPasswordNew.addEventListener('change', function () {
            newPasswordField.type = showPasswordNew.checked ? 'text' : 'password';
        });
    }

    // Hiển thị mật khẩu xác nhận
    if (showPasswordConfirm) {
        showPasswordConfirm.addEventListener('change', function () {
            confirmPasswordField.type = showPasswordConfirm.checked ? 'text' : 'password';
        });
    }
});
