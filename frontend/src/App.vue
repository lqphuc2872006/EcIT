<script setup>
import DangNhap from "@/components/Login/DangNhap.vue";
import HeaderView from "@/components/ViewHeaderFooter/HeaderView.vue";
import FooterView from "@/components/ViewHeaderFooter/FooterView.vue";
</script>
<template>
  <HeaderView/>
  <img class="banner" src="@/assets/banner.jpg">
  <router-view/>
  <FooterView/>
</template>
<style scoped>
.banner{
  width: 100%;
  height: 85vh;
}

</style>
