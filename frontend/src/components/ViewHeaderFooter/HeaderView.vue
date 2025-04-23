<script setup>
</script>

<template>
  <div class="header">
    <img src="@/assets/logoEcoit.jpg" alt="Logo">
    <ul>
      <li><a href="/home">Trang Chủ</a></li>
      <li><a href="">Giới Thiệu</a></li>
      <li><a href="/nhanvien">Nhân Viên</a></li>
      <li><a class="login-link" href="/dangnhap">Đăng nhập</a></li>
    </ul>
  </div>
</template>

<style scoped>
.header {
  width: 100%;
  background-color: #242424;
  padding: 0 30px;
  box-sizing: border-box;
  height: 80px;
  display: flex;
  align-items: center;
  justify-content: space-between;
}

.header img {
  height: 40px;
  object-fit: contain;
}

.header ul {
  display: flex;
  gap: 100px;
  margin: 0;
}

.header li a {
  color: white;
  text-decoration: none;
  font-weight: bold;
  position: relative;
  padding-bottom: 5px;
}

.header li a::after {
  content: '';
  position: absolute;
  left: 0;
  bottom: 0;
  width: 0%;
  height: 2px;
  background-color: #a8ff78;
  transition: width 0.3s;
}

.header li a:hover::after {
  width: 100%;
}


.header li a:hover {
  color: #a8ff78;
}
.login-link {
  border: 2px solid #a8ff78;
  padding: 10px;
  border-radius: 10px 5px;

}

.login-link:hover {
}
</style>
