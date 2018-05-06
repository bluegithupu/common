'use strict';
angular.module('academy_tfboys')

    .factory('pathProject', function (commonUtil) {
        return {
                	     admin: function (id) {
                if (!id) {
                    return "ajax/u/admin";
                } else {
                    return "ajax/u/admin/" + id;
                }
            },
          admin_list: "ajax/u/admin/search"
          
                                   ,  
                        
          
         
         	     admin: function (id) {
                if (!id) {
                    return "ajax/u/admin";
                } else {
                    return "ajax/u/admin/" + id;
                }
            },
          admin_list: "ajax/u/admin/search"
          
                                   ,  
                        
          
         
         	     admin: function (id) {
                if (!id) {
                    return "ajax/u/admin";
                } else {
                    return "ajax/u/admin/" + id;
                }
            },
          admin_list: "ajax/u/admin/search"
          
                                   ,  
                        
          
         
         	     admin: function (id) {
                if (!id) {
                    return "ajax/u/admin";
                } else {
                    return "ajax/u/admin/" + id;
                }
            },
          admin_list: "ajax/u/admin/search"
          
                                   ,  
                        
          
         
         	     admin: function (id) {
                if (!id) {
                    return "ajax/u/admin";
                } else {
                    return "ajax/u/admin/" + id;
                }
            },
          admin_list: "ajax/u/admin/search"
          
                                   ,  
                        
          
         
         	     admin: function (id) {
                if (!id) {
                    return "ajax/u/admin";
                } else {
                    return "ajax/u/admin/" + id;
                }
            },
          admin_list: "ajax/u/admin/search"
          
                                   ,  
                        
          
         
         	     admin: function (id) {
                if (!id) {
                    return "ajax/u/admin";
                } else {
                    return "ajax/u/admin/" + id;
                }
            },
          admin_list: "ajax/u/admin/search"
          
                                   ,  
                        
          
         
         	     admin: function (id) {
                if (!id) {
                    return "ajax/u/admin";
                } else {
                    return "ajax/u/admin/" + id;
                }
            },
          admin_list: "ajax/u/admin/search"
          
                                   ,  
                        
          
         
         	     admin: function (id) {
                if (!id) {
                    return "ajax/u/admin";
                } else {
                    return "ajax/u/admin/" + id;
                }
            },
          admin_list: "ajax/u/admin/search"
          
                                   ,  
                        
          
         
         	     admin: function (id) {
                if (!id) {
                    return "ajax/u/admin";
                } else {
                    return "ajax/u/admin/" + id;
                }
            },
          admin_list: "ajax/u/admin/search"
          
                                   ,  
                        
          
         
         	     admin: function (id) {
                if (!id) {
                    return "ajax/u/admin";
                } else {
                    return "ajax/u/admin/" + id;
                }
            },
          admin_list: "ajax/u/admin/search"
          
                                   ,  
                        
          
         
         	     admin: function (id) {
                if (!id) {
                    return "ajax/u/admin";
                } else {
                    return "ajax/u/admin/" + id;
                }
            },
          admin_list: "ajax/u/admin/search"
          
                        
          
         
         
        }
    })
    
           
	    .factory('userService', function ($http, pathProject) {
        return {
            add: function (params) {
                return $http.post(pathProject.user(), params);
            },
            update: function (id, params) {
              
                return $http.put(pathProject.user(id), params);
            },
            getList: function (params) {
                return $http.get(pathProject.user_list, {params: params});
            },
            get: function (id) {
                return $http.get(pathProject.user(id));
            },            
            del: function (id) {
                
                return $http.delete(pathProject.user(id));
            }
           
        }
    })
                
	    .factory('articleService', function ($http, pathProject) {
        return {
            add: function (params) {
                return $http.post(pathProject.article(), params);
            },
            update: function (id, params) {
              
                return $http.put(pathProject.article(id), params);
            },
            getList: function (params) {
                return $http.get(pathProject.article_list, {params: params});
            },
            get: function (id) {
                return $http.get(pathProject.article(id));
            },            
            del: function (id) {
                
                return $http.delete(pathProject.article(id));
            }
           
        }
    })
                
	    .factory('videoService', function ($http, pathProject) {
        return {
            add: function (params) {
                return $http.post(pathProject.video(), params);
            },
            update: function (id, params) {
              
                return $http.put(pathProject.video(id), params);
            },
            getList: function (params) {
                return $http.get(pathProject.video_list, {params: params});
            },
            get: function (id) {
                return $http.get(pathProject.video(id));
            },            
            del: function (id) {
                
                return $http.delete(pathProject.video(id));
            }
           
        }
    })
                
	    .factory('teacherService', function ($http, pathProject) {
        return {
            add: function (params) {
                return $http.post(pathProject.teacher(), params);
            },
            update: function (id, params) {
              
                return $http.put(pathProject.teacher(id), params);
            },
            getList: function (params) {
                return $http.get(pathProject.teacher_list, {params: params});
            },
            get: function (id) {
                return $http.get(pathProject.teacher(id));
            },            
            del: function (id) {
                
                return $http.delete(pathProject.teacher(id));
            }
           
        }
    })
                
	    .factory('userSignService', function ($http, pathProject) {
        return {
            add: function (params) {
                return $http.post(pathProject.userSign(), params);
            },
            update: function (id, params) {
              
                return $http.put(pathProject.userSign(id), params);
            },
            getList: function (params) {
                return $http.get(pathProject.userSign_list, {params: params});
            },
            get: function (id) {
                return $http.get(pathProject.userSign(id));
            },            
            del: function (id) {
                
                return $http.delete(pathProject.userSign(id));
            }
           
        }
    })
                
	    .factory('userArticleService', function ($http, pathProject) {
        return {
            add: function (params) {
                return $http.post(pathProject.userArticle(), params);
            },
            update: function (id, params) {
              
                return $http.put(pathProject.userArticle(id), params);
            },
            getList: function (params) {
                return $http.get(pathProject.userArticle_list, {params: params});
            },
            get: function (id) {
                return $http.get(pathProject.userArticle(id));
            },            
            del: function (id) {
                
                return $http.delete(pathProject.userArticle(id));
            }
           
        }
    })
                
	    .factory('userVideoService', function ($http, pathProject) {
        return {
            add: function (params) {
                return $http.post(pathProject.userVideo(), params);
            },
            update: function (id, params) {
              
                return $http.put(pathProject.userVideo(id), params);
            },
            getList: function (params) {
                return $http.get(pathProject.userVideo_list, {params: params});
            },
            get: function (id) {
                return $http.get(pathProject.userVideo(id));
            },            
            del: function (id) {
                
                return $http.delete(pathProject.userVideo(id));
            }
           
        }
    })
                
	    .factory('temporaryDataService', function ($http, pathProject) {
        return {
            add: function (params) {
                return $http.post(pathProject.temporaryData(), params);
            },
            update: function (id, params) {
              
                return $http.put(pathProject.temporaryData(id), params);
            },
            getList: function (params) {
                return $http.get(pathProject.temporaryData_list, {params: params});
            },
            get: function (id) {
                return $http.get(pathProject.temporaryData(id));
            },            
            del: function (id) {
                
                return $http.delete(pathProject.temporaryData(id));
            }
           
        }
    })
                
	    .factory('moduleService', function ($http, pathProject) {
        return {
            add: function (params) {
                return $http.post(pathProject.module(), params);
            },
            update: function (id, params) {
              
                return $http.put(pathProject.module(id), params);
            },
            getList: function (params) {
                return $http.get(pathProject.module_list, {params: params});
            },
            get: function (id) {
                return $http.get(pathProject.module(id));
            },            
            del: function (id) {
                
                return $http.delete(pathProject.module(id));
            }
           
        }
    })
                
	    .factory('roleService', function ($http, pathProject) {
        return {
            add: function (params) {
                return $http.post(pathProject.role(), params);
            },
            update: function (id, params) {
              
                return $http.put(pathProject.role(id), params);
            },
            getList: function (params) {
                return $http.get(pathProject.role_list, {params: params});
            },
            get: function (id) {
                return $http.get(pathProject.role(id));
            },            
            del: function (id) {
                
                return $http.delete(pathProject.role(id));
            }
           
        }
    })
                
	    .factory('moduleRoleService', function ($http, pathProject) {
        return {
            add: function (params) {
                return $http.post(pathProject.moduleRole(), params);
            },
            update: function (id, params) {
              
                return $http.put(pathProject.moduleRole(id), params);
            },
            getList: function (params) {
                return $http.get(pathProject.moduleRole_list, {params: params});
            },
            get: function (id) {
                return $http.get(pathProject.moduleRole(id));
            },            
            del: function (id) {
                
                return $http.delete(pathProject.moduleRole(id));
            }
           
        }
    })
                
	    .factory('adminService', function ($http, pathProject) {
        return {
            add: function (params) {
                return $http.post(pathProject.admin(), params);
            },
            update: function (id, params) {
              
                return $http.put(pathProject.admin(id), params);
            },
            getList: function (params) {
                return $http.get(pathProject.admin_list, {params: params});
            },
            get: function (id) {
                return $http.get(pathProject.admin(id));
            },            
            del: function (id) {
                
                return $http.delete(pathProject.admin(id));
            }
           
        }
    })
             
   
    ;






