# Здесь укажи какие нормализованные события (одно или несколько) ты подаешь на вход правилу корреляции.
# События отделяются друг от друга символом новой строки. Каждое их них должно быть записано в строку.
{"action":"detect","category.generic":"Connection","category.high":"Network Interaction Management","category.low":"State","direction":"egress","dst.hostname":"-","dst.ip":"192.168.0.30","dst.port":445,"event_src.category":"Other","event_src.fqdn":"dc01.work.local","event_src.hostname":"dc01","event_src.rule":"-","event_src.subsys":"Microsoft-Windows-Sysmon/Operational","event_src.title":"sysmon","event_src.vendor":"microsoft","id":"PT_Microsoft_Windows_eventlog_Sysmon_3_Network_connection","importance":"info","msgid":"3","object":"connection","object.account.domain":"nt authority","object.account.id":"synthetic:система@nt authority","object.account.name":"система","object.process.fullpath":"system","object.process.guid":"0d1d3b46-ecbd-6a19-eb03-000000000000","object.process.id":"4","object.process.name":"system","protocol":"tcp","src.fqdn":"dc01.work.local","src.hostname":"dc01","src.ip":"192.168.0.10","src.port":49359,"status":"success","subject":"rule","subject.name":"-","time":"2026-05-29T20:23:51.668Z"}

# Тут будет твой модульный тест.
# Пример:
## создать для теста временную БД с табличными списками
# table_list default
## ожидаемое заполнение табличных списков
# table_list {"AD_Domain_Controllers":[{"ip":"8.8.8.8","hostname":"dc.contoso.com"}]}
## ожидаеммые события
# expect <число>|not|any {<через запятую пары "поле":"значение">}
    
table_list default
# table_list {
#     "Server_IP_List": [
#         {
#             "ip": "192.168.0.30"
#         }
#     ]
# }
expect 1 {"correlation_name":"CVE_2021_36942"}