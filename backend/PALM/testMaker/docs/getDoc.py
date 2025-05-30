from lxml import etree, html

def getDoc(_target_func):
    ret = []
    for doc_name in ['docs/String.txt', 'docs/Math.txt']:
        doc = etree.parse(doc_name, etree.HTMLParser())
        member_list = doc.xpath("//section[@id='method-detail']//ul[@class='member-list']")[0]
        for member in member_list.xpath(".//li"):
            _funcName = member.xpath(".//section[@class='detail']//h3//text()")
            if len(_funcName) > 0:
                funcName = _funcName[0]
                _signature = member.xpath(".//section[@class='detail']//div[@class='member-signature']")
                signature = _signature[0].xpath("string(.)")
                _block = member.xpath(".//section[@class='detail']//div[@class='block']")
                block = _block[0].xpath("string(.)")
                #print(funcName, signature, block)
                if funcName.lower() == _target_func.lower():
                    ret += [(signature, block)]
    return ret

def getDoc2(signature):
    for doc_name in ['docs/String.txt', 'docs/Math.txt']:
        if not ("String" in signature and "String" in doc_name) and not ("Math" in signature and "Math" in signature):
            continue
        doc = etree.parse(doc_name, etree.HTMLParser())

        _target_func = signature.split("(")[0].split(".")[-1]
        #print(signature, _target_func)

        ret = []
        member_list = doc.xpath("//section[@id='method-detail']//ul[@class='member-list']")[0]
        for member in member_list.xpath(".//li"):
            _funcName = member.xpath(".//section[@class='detail']//h3//text()")
            if len(_funcName) > 0:
                funcName = _funcName[0]
                _signature = member.xpath(".//section[@class='detail']//div[@class='member-signature']")
                signature = _signature[0].xpath("string(.)")
                _block = member.xpath(".//section[@class='detail']//div[@class='block']")
                block = _block[0].xpath("string(.)")
                #print(funcName, signature, block)
                if funcName.lower() == _target_func.lower():
                    return [(f"[signature] {signature}\n[document] {block}")]
                    ret += [(signature, block)]
    return []

if __name__ == "__main__":
    for signature, block in getDoc("abs"):
        print('[signature]', signature)
        print('[block]', block)