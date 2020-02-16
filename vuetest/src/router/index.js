import Vue from 'vue'
import VueRouter from 'vue-router'
import Home from '../views/Home.vue'
import Page1 from '../views/Page1'
import Page2 from '../views/Page2'
import Page3 from '../views/Page3'
import Page4 from '../views/Page4'


Vue.use(VueRouter)

const routes = [
    {
        path: '/',
        name: 'Home',
        component: Home,
        childern:[

            {
                path: '/page1',
                name: '页面1',
                component: Page1
            },
            {
                path: '/page2',
                name: '页面2',
                component: Page2
            }

        ]
    },

    {
        path: '/about',
        name: 'About',
        component: Home,
        childern:[

            {
                path: '/page1',
                name: '页面1',
                component: Page1
            },
            {
                path: '/page2',
                name: '页面2',
                component: Page2
            }

        ]
    },

    {
        path: '/nav1',
        name: '导航1',
        component: Home,
        childern:[

            {
                path: '/page3',
                name: '页面3',
                component: Page3
            },
            {
                path: '/page4',
                name: '页面4',
                component: Page4
            }

        ]
    },
    {
        path: '/nav2',
        name: '导航2',
        component: Home,
        childern:[

            {
                path: '/page3',
                name: '页面3',
                component: Page3
            },
            {
                path: '/page4',
                name: '页面4',
                component: Page4
            }

        ]
    },


]

const router = new VueRouter({
    mode: 'history',
    base: process.env.BASE_URL,
    routes
})

export default router