name: Server_IP_List
type: 1
fillType: Registry
userCanEditContent: true
fields:
  - ip:
      type: String
      primaryKey: true
      index: true
      nullable: false
defaults:
  PT:
    - ip: 192.168.0.10
