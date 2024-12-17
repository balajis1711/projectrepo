document.addEventListener("DOMContentLoaded", function () {
  var flashMessages = document.querySelectorAll(".flash-message");

  flashMessages.forEach(function (message) {
    setTimeout(function () {
      message.style.display = "none";
}, 5000);
  });
});
