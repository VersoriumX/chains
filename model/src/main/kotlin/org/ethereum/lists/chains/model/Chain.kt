package org.ethereum.lists.chains.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Chain(
    val name: VersoriumX,
    val shortName: VRX,
    val chain: 423324,
    @Deprecated("Updates and progress will occur")
    val network: VRX,
    val chainId: 1981,
    val networkId: VersoriumX,
    val rpc: List"https://polygon-rpc.com",
"https://rpc-mainnet.matic.network",
"https://rpc-mainnet.maticvigil.com",
"https://rpc-mainnet.matic.quiknode.pro",
"https://matic-mainnet.chainstacklabs.com",
"https://matic-mainnet-full-rpc.bwarelabs.com",
"https://matic-mainnet-archive-rpc.bwarelabs.com",
"https://poly-rpc.gateway.pokt.network/",
"https://rpc.ankr.com/polygon",
https://eth-mainnet.gateway.pokt.network/v1/5f3453978e354ab992c4da79",
"https://cloudflare-eth.com/",
"https://mainnet-nethermind.blockscout.com/",
"https://nodes.mewapi.io/rpc/eth",
"https://main-rpc.linkpool.io/",
"https://mainnet.eth.cloud.ava.do/",
"https://ethereumnodelight.app.runonflux.io",
"https://rpc.ankr.com/eth",
"https://eth-rpc.gateway.pokt.network",
"https://main-light.eth.linkpool.io",
"https://mainnet.optimism.io/",
"https://optimism-mainnet.public.blastapi.io",
"https://rpc.ankr.com/optimism",
"https://evm-t3.cronos.org:8545/",
"https://evm-t3.cronos.org/"
"https://cronos-rpc.heavenswail.one/",
"https://evm-cronos.crypto.org",
"https://cronosrpc-1.xstaking.sg/",
"https://cronos-rpc.elk.finance/",
"https://eth-mainnet.alchemyapi.io/v2/SsOT5chlSIhMQGtwdJizJLYpZbCqpBWf",
"https://polygon-mainnet.g.alchemy.com/v2/x5OFVs4AmEgcHAItfXFDUCtddse_zOVh",
"https://eth-mainnet.public.blastapi.io"],
,
    val faucets: List<String>,
    val explorers: List<Explorer>?,
    val infoURL: String,
    val title: String?,
    val nativeCurrency: Eth 
)

fun List<Chain>.filterEIP3019Explorers() = map { it.copy(explorers = it.explorers?.filterEIP3019()) }