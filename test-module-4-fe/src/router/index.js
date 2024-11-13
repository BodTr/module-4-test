import { createRouter, createWebHistory } from "vue-router";
import OrdersManager from "@/views/OrdersManager.vue";

const router = createRouter({
    history: createWebHistory(import.meta.env.BASE_FE_URL),
    base: '/#/',
    routes: [
        {
            path: '/',
            name: 'home-page',
            component: OrdersManager
        }
    ]
})

export default router

