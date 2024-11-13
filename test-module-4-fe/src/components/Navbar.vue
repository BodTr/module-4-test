<template>
    <aside
      class="navbar navbar-vertical navbar-expand-lg navbar-dark"
    >
      <div class="container-fluid">
        <button
          class="navbar-toggler"
          type="button"
          data-bs-toggle="collapse"
          data-bs-target="#sidebar-menu"
          aria-controls="sidebar-menu"
          aria-expanded="false"
          aria-label="Toggle navigation"
        >
          <span class="navbar-toggler-icon"></span>
        </button>
        <div class="navbar-brand navbar-brand-autodark" style="height: 90px">
          <a href=".">
            <img
              src="../assets/photos/book_store_icon.png"
              width="60"
              height="60"
              alt="book-store-logo"
              class="navbar-brand-image-xl"
            />
          </a>
        </div>
        <div class="collapse navbar-collapse show" id="sidebar-menu">
          <ul class="navbar-nav pt-lg-3">
            <li class="nav-item dropdown">
              <a
                class="nav-link"
                href="#navbar-base"
                data-bs-toggle="dropdown"
                data-bs-auto-close="false"
                role="button"
                aria-expanded="true"
              >
                <span class="nav-link-icon d-md-none d-lg-inline-block"
                  ><!-- Download SVG icon from http://tabler-icons.io/i/package -->
                  <svg
                    xmlns="http://www.w3.org/2000/svg"
                    class="icon"
                    width="24"
                    height="24"
                    viewBox="0 0 24 24"
                    stroke-width="2"
                    stroke="currentColor"
                    fill="none"
                    stroke-linecap="round"
                    stroke-linejoin="round"
                  >
                    <path stroke="none" d="M0 0h24v24H0z" fill="none"></path>
                    <path d="M12 3l8 4.5l0 9l-8 4.5l-8 -4.5l0 -9l8 -4.5"></path>
                    <path d="M12 12l8 -4.5"></path>
                    <path d="M12 12l0 9"></path>
                    <path d="M12 12l-8 -4.5"></path>
                    <path d="M16 5.25l-8 4.5"></path>
                  </svg>
                </span>
                <span
                  class="nav-link-title"
                  style="font-size: 15px; font-weight: 600; color: #fff"
                >
                  Quản lý đơn hàng</span
                >
              </a>
              <div class="dropdown-menu">
                <router-link
                  class="dropdown-item"
                  to="/books-manager"
                  ></router-link
                >
              </div>
            </li>
          </ul>
        </div>
      </div>
    </aside>
  </template>
  
  <script>

  </script>
  
  <style></style>
  