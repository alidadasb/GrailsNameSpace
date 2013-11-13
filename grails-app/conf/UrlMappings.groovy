class UrlMappings {

	static mappings = {
		"/foo/admin" {
			controller="foo"
			 namespace = 'admin'
		}

		"/foo/public" {
			controller="foo"
			namespace = 'public'
		}

		"/$controller/$action?/$id?(.${format})?"{
			constraints {
                // apply constraints here
            }
        }

        "/"(view:"/index")
        "500"(view:'/error')
    }
}
