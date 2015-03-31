Ext.ns('com.oocl.ir4.sps.web.js');

com.oocl.ir4.sps.web.js.firstTimeLogin = Ext.extend(
    Ext.Window,{
        initComponent : function () {
            this.height = 562;
            this.width = 775;
            this.resizable = false;
            this.maximizable = false;
            border : false,
            this.title = 'User Guide';
            this.isCloseWindowPopupMsg = true;
            this.modal = true;
            var paramVo = {};
            paramVo.userId = 123;
//            this.on('show', function() {
//                UserGuideController.checkFirstTimeLogin('1234',paramVo,function(result) {
//                    var bbb = 123;
//                })
//            })
            this.items =[];
            this.items.push(this._getPanel());
            com.oocl.ir4.sps.web.js.firstTimeLogin.superclass.initComponent.call(this);
        },
        _getPanel : function () {
            var panelId = this.getId() + 'panelId';
            var guidePanel = {
                xtype : 'panel',
                height : 562,
                width : 775,
                html : '<iframe scrolling="auto" frameborder="0" width="100%" height="100%" src="../userGuide.jsp" ></iframe>'
//                autoLoad  : {url :GlobalConfiguration.appPath + 'userGuide.jsp',scripts:true}
            }
            this._getPanel = function() {
                return this.findById(panelId);
            }
            return guidePanel;
        }
    }

)