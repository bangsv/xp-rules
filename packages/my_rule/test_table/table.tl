name: test_table
type: 1
fillType: Registry
userCanEditContent: true
fields:
  - name_protocol:
      type: String
      primaryKey: true
      index: true
      nullable: false
  - protocol:
      type: Number
      index: false
      nullable: false
      primaryKey: false
      unique: false
defaults:
  PT:
    - name_protocol: SSH
      protocol: 22
    - name_protocol: DNS
      protocol: 53
    - name_protocol: Telenet
      protocol: 23
