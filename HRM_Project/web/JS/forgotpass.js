document.addEventListener("DOMContentLoaded", function () {
    const modal = document.getElementById('errorModal');
    if (modal) {
        // Hiển thị modal khi trang đã tải xong
        modal.style.display = 'block';
        // Đặt thời gian tự động ẩn modal sau 5 giây
        setTimeout(function () {
            modal.style.display = 'none';
        }, 4000);
    }
});
