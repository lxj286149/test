webpackJsonp([2], {
    "+skl": function (e, n) {
    }, NHnr: function (e, n, t) {
        "use strict";
        Object.defineProperty(n, "__esModule", {value: !0});
        var r = t("7+uW"), u = {
            render: function () {
                var e = this.$createElement, n = this._self._c || e;
                return n("div", {attrs: {id: "app"}}, [n("router-view")], 1)
            }, staticRenderFns: []
        };
        var a = t("VU/8")({name: "App"}, u, !1, function (e) {
            t("cgoK")
        }, null, null).exports, o = t("/ocq");
        r.default.use(o.a);
        var p = new o.a({
            routes: [{
                path: "/", name: "Login", component: function () {
                    return t.e(0).then(t.bind(null, "NaOX"))
                }
            }]
        }), c = t("BTaQ"), i = t.n(c);
        t("+skl");
        r.default.use(i.a), r.default.config.productionTip = !1, new r.default({
            el: "#app",
            router: p,
            components: {App: a},
            template: "<App/>"
        })
    }, cgoK: function (e, n) {
    }
}, ["NHnr"]);
//# sourceMappingURL=app.406619f75b29b7306b63.js.map
