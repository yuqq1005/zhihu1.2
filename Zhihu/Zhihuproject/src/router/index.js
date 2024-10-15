import { createRouter , createWebHashHistory } from "vue-router"
const router = createRouter({
    history: createWebHashHistory(),

    routes: [
        // 登录页
        {
            path: '/login',
            component: () => import('@/view/login/LoginPage.vue')
        },
        {
            path: '/',
            component: () => import('@/view/layout/LayoutContainer.vue'),
            redirect: '/user/combined',
            children: [{
                path: '/user/combined',
                component: () => import('@/view/combined/CombinedPage.vue')
            }]
        }

    ]
})
export default router