
const header = document.querySelector("header");
const headerContent =`
	<nav class="navbar navbar-expand-md navbar-dark bg-dark">
  <a class="navbar-brand" href="#">KaWa Hotel</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>

  <div class="collapse navbar-collapse" id="navbarSupportedContent">
    <ul class="navbar-nav ml-auto">
      <li class="nav-item">
        <a class="nav-link" href="home.html">Home</a>
      </li>
       <li class="nav-item">
        <a class="nav-link" href="images.html">Images</a>
      </li>
       <li class="nav-item">
        <a class="nav-link" href="location.html">location</a>
      </li>
       <li class="nav-item">
        <a class="nav-link" href="aboutus.html">About Us</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="contactus.html">Contact Us</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="reviews.html">Reviews</a>
      </li>
    </ul>
  </div>
</nav>`;
header.innerHTML=headerContent;